import java.util.ArrayList;
import java.util.List;

public class Chain {
    private List<KidNode> chainList = new ArrayList<>();
    private KidNode focusedKidNode;
    private Integer outNumber;

    Chain(Integer n,Integer k){
        setOutNumber(k);
        for (int i = 1; i < n+1; i++) {
            KidNode newKidNode = new KidNode(i);
            if(focusedKidNode == null){
                focusedKidNode = newKidNode;
            } else{
                focusedKidNode.setNextKidNode(newKidNode);
                focusedKidNode = newKidNode;
            }
            chainList.add(newKidNode);
        }
        focusedKidNode.setNextKidNode(chainList.get(0));
    }

    public List<Integer> tinkerTailor(){
        List<Integer> outs = new ArrayList<>();
        while(chainList.size()>1) {
            for (int i = 0; i < outNumber - 1; i++) {
                focusedKidNode = focusedKidNode.getNextKidNode();
            }
            outs.add(focusedKidNode.getNextKidNode().getMyNum());
            chainList.remove(focusedKidNode.getNextKidNode());
            focusedKidNode.setNextKidNode(focusedKidNode.getNextKidNode().getNextKidNode());
        }
        outs.add(chainList.get(0).getMyNum());
        return outs;
    }

    public void setOutNumber(Integer outNumber) {
        this.outNumber = outNumber;
    }

    public static void main(String[] args){
        Chain chain = new Chain(5,3);
        chain.tinkerTailor().stream().forEach(System.out::println);
    }
}
