public class Main {
    public static void main(String[] args) {

        int [][] list = {{1,2,3},
        {4,5,6}};
        System.out.println("Matris : ");

        for (int[] row: list){
            for (int column: row){
                System.out.print(" " + column + " ");
            }
            System.out.println();
        }

        System.out.println("Matris Transpoze : ");
        int column = list[0].length;
        for (int i=0;i < column;i++){
            for (int j=0;j<list.length;j++){
                System.out.print(" " + list[j][i]+" ");
            }
            System.out.println();
        }
    }
}











