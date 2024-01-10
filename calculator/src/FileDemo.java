import java.io.*;
class FileDemo{
    public static void main(String args[]) throws IOException{
        File f1=new File("FileDemo.txt");
        f1.createNewFile();
        System.out.println("FIle Name:"+f1.getName());
        System.out.println("Path:"+f1.getPath());
        System.out.println("Abs path:"+f1.getAbsolutePath());
        System.out.println(f1.exists()?"exists":"does not exist");
        System.out.println("File size:"+f1.length()+"Bytes");
    }
}