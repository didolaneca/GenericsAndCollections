public class BingoChip<S,I> {/* TODO
Implement this class.
Use the instructions and check how it is used in Task.java*/
    private S column;
    private I row;

    public BingoChip(S column, I row){
        this.column = column;
        this.row = row;
    }

    @Override
    public String toString(){
        return "Chip:" + column + "-" + row;
    }
}