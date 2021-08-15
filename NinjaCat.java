
import java.awt.Color;


public class NinjaCat extends Critter {
    private int infections;
    public NinjaCat(){
        infections=0;
    }

    //display number of infections
    public String toString(){
        return "^"+infections+"^ ";
    }

    //color is based on how many infections it has done
    public Color getColor(){
        if(infections==0){
            return Color.YELLOW;
        }
        else if(infections==1){
            return Color.CYAN;
        }
        else if (infections==2){
            return Color.MAGENTA;
        }
        else if (infections==3){
            return Color.ORANGE;
        }

        return Color.RED;

    }

   //adjusted from Giant
    public Critter.Action getMove(CritterInfo info){


        if (info.getFront()==Critter.Neighbor.OTHER){
            infections++;
            return Critter.Action.INFECT;

        }
        else if(info.getFront()==Critter.Neighbor.EMPTY){
            return Critter.Action.HOP;
        }
        else{
            return Action.LEFT;
        }
    }
}
