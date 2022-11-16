import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CellulGrid {

    private List<List<Boolean>> state;

    public CellulGrid(List<List<Boolean>> lists) {
        this.state = new ArrayList<>(lists.stream().map(l -> new ArrayList<>(l)).collect(Collectors.toList()));
    }

    public void nextGeneration() {
        for (int i = 0; i < state.size(); i++){
            for (int j = 0; j < state.get(0).size(); j++){
                //neighbors

            }
        }
    }

    public int stateOfCel(List<List<Boolean>> state, int i, int j){
        if (i>0 && i<state.size() && j>0 && j<state.get(0).size()){
            return  -1;
        }else{
            return state.get(i).get(j) == true ? 
        }
    }

    public boolean isLive(int i, int j) {
        return state.get(i).get(j);
    }
}
