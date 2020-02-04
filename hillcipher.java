import java.io.*;
import java.util.*;
import java.io.*;
public class HillCipher {
static float[][]decrypt=new float[3][1];
static float[][] a=new float[3][3];
static float[][] b=newfloat[3][3]; static float[][] mes=newfloat[3][1];
staticfloat[][ ]res=new float[3][1];
static BufferedReaderbr=new BufferedReader(newInputStreamReader(System.in)); static Scannersc=new Scanner(System.in);
public static void main(String[]args) throws IOException {
//TODO code application logic here get keymes();
for(int i=0;i<3;i++)
for(int j=0;j<1;j++)
for(int k=0;k<3;k++){
res[i][j]=res[i][j]+a[i][k]*mes[k][j];
}
System.out.print("\nEncryptedstringis:");
for(int i=0;i<3;i++) {
System.out.print((char)(res[i][0]%26+97));
res[i][0]=res[i][0];
}
inverse();
for(int i=0;i<3;i++)
for(int j=0;j<1;j++)
for(int k=0;k<3;k++) {
decrypt[i][j]=decrypt[i][j]+b[i][k]*res[k][j];
}
System.out.print("\nDecryptedstringis:");
for(int i=0;i<3;i++) {
System.out.print((char)(decrypt[i][0]%26+97));
}
System.out.print("\n");
}
Public static void getkeymes( )throwsIOException { System.out.println("Enter3x3matrixforkey(Itshouldbeinversible):");
 for(int i=0;i<3;i++)
for(int j=0;j<3;j++)
a[i][j]=sc.nextFloat();
System.out.print("\nEntera3letterstring:");
Stringmsg=br.readLine();
for(int i=0;i<3;i++)
mes[i][0]=msg.charAt(i)-97;
}
Public static void inverse() {
float p,q;
float[][] c=a;
for(int i=0;i<3;i++)
for(int j=0;j<3;j++){
//a[i][j]=sc.nextFloat();
if(i==j)
b[i][j]=1;
else

b[i][j]=0;
}
for(int k=0;k<3;k++) {
for(int i=0;i<3;i++ ){
p=c[i][k];
q=c[k][k];
for(intj=0;j<3;j++) { if(i!=k) {
c[i][j]=c[i][j]*q-p*c[k][j];
b[i][j]=b[i][j]*q-p*b[k][j];
}}}}
for(int i=0;i<3;i++)
for(int j=0;j<3;j++) { b[i][j]=b[i][j]/c[i][i];
}
System.out.println("");
System.out.println("\nInverseMatrixis:");
for(int i=0;i<3;i++) {
for(int j=0;j<3;j++)
System.out.print(b[i][j]+"     ");
System.out.print("\n");}
}}