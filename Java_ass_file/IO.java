// what is io exception?
// it already ignores the exception in the library end. it does not handle the exception. it just ignore exception.
// IOException is a checked exception in Java that occurs when there is a failure during input/output operations. It is part of the java.io package and is typically thrown when there are issues with file handling, network communication, or other I/O operations. Examples include FileNotFoundException, EOFException, and SocketException. IOException is a subclass of Exception, which means it must be either caught or declared in the method  using the throws keyword.
//Throw always applied on instances.




// IO demo code:

import java.io.*;
class IO {
    public static void main(String args[]){
        try{
            FileInputStream fis = new FileInputStream("hari.jpeg");
            int x=fis.read();
            FileOutputStream fos = new FileOutputStream("vishnu.jpeg");
            while(x!=-1){

                fos.write(x);
                x = fis.read();
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}