public class KidNode {
    private Integer myNum;
    private KidNode nextKidNode;

    KidNode(Integer myNum){
        setMyNum(myNum);
    }

    public Integer getMyNum() {
        return myNum;
    }

    public void setMyNum(Integer myNum) {
        this.myNum = myNum;
    }

    public KidNode getNextKidNode() {
        return nextKidNode;
    }

    public void setNextKidNode(KidNode nextKidNode) {
        this.nextKidNode = nextKidNode;
    }
}
