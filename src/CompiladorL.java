public class CompiladorL {

    public static void main(String[] args) {
        Lexico lexico = new Lexico("src\\codigo.txt");
        Token t = null;
        while((t = lexico.nextToken()) != null){
            System.out.println(t.toString());
        }
    }
}