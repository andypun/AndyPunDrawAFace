package AndyPun;

public class Runner {

    public static void main(String[] args) {
        String[][] face = new String[5][8];
        FaceDrawing face1 = new FaceDrawing(face);
        face1.fill("x");
        face1.edit(" ",0,0);
        face1.edit(" ",0,2);
        face1.edit(" ",0,3);
        face1.edit(" ",0,4);
        face1.edit(" ",0,5);
        face1.edit(" ",0,7);
        face1.edit(" ",1,3);
        face1.edit(" ",1,4);
        face1.edit("^",2,1);
        face1.edit("^",2,2);
        face1.edit("^",2,5);
        face1.edit("^",2,6);
        face1.edit("[",3,3);
        face1.edit("]",3,4);
        face1.edit(">",3,2);
        face1.edit("<",3,5);
        face1.edit("_",3,2);
        face1.edit("_",3,3);
        face1.edit("_",3,4);
        face1.edit("_",3,5);
        face1.edit("|",4,2);
        face1.edit("_",4,3);
        face1.edit("_",4,4);
        face1.edit("|",4,5);
        System.out.println(face1);
    }
}
