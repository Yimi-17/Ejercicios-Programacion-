
package pe.edu.upeu.matrices;

import java.util.Scanner;

public class EjerciciosMatrices {
    static Scanner cs=new Scanner(System.in);
   
    public static void imprimirMatriz(int[][] M){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
               if(j==0 && i!=0){System.out.println("");}
                System.out.print("\t"+M[i][j]+"|");
            }
        }
        System.out.println("");
    }
    
    public static int[][] Ejercioio01(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {                
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + i;               
            }
        }        
        return M;
    }
    
    public static int[][] Ejercioio02(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {                
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + j;                  
            }
        }        
        return M;
        }
    
    public static int[][] Ejercioio03(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {                
                if((i+j)%2==0){
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + j;      
                }else{
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + i;      
                }
            }
        }        
        return M;
        }
    
    public static int[][] Ejercioio04(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {                
                if((i+j)%2==0){
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + i;      
                }else{
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + j;      
                }                
            }
        }        
        return M;
        }
    public static int[][] Ejercioio05(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = i; j <= dim-1; j++) {                
                M[j][i]=numInit;
                numInit++;
            }
        }        
        return M;
        }
    
    public static int[][] Ejercioio06(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j <= i; j++) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        }
    public static int [][] Ejercicio07(){
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz ");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese direccionando base");
        int munit=lt.nextInt();
        for (int i = 0; i <dim; i++) {
            for (int j = 0; j <dim-i; j++) {               
                M[i][j]=munit;
                munit++;
            
            }
        }    
        return M;
    }
    public static int[][] Ejercioio08(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = i; j < dim; j++) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        } 
    public static int [][] Ejercicio12(){
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz: ");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese direccionando base:");
        int munit=lt.nextInt();
        for(int j = 0; j <dim; j++) {
            for(int i = dim-1; i >=0+j; i--) {               
                M[j][i]=munit;
                munit++;
            
            }
        }
        
        return M;
    }
public static int[][] Ejercioio14(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j <= i; j++) {                
                M[j][i]=numInit;
                numInit++;
            }
        }        
        return M;
        }
    
    public static int[][] Ejercioio15(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for(int j = 0; j <dim; j++){
            for (int i = dim-1; i >=0+j; i--) {
                System.out.println("M["+i+"]["+j+"]="+numInit);
                M[i][j]=numInit;
                numInit++;
            }        
        }
        return M;
        }
    public static int[][] Ejercioio16(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();//dim=5 numInit=0
        for(int j = 0; j <dim; j++){
            for (int i = dim-1; i >=(dim-1)-j; i--) {
                System.out.println("M["+i+"]["+j+"]="+numInit);
                M[i][j]=numInit;
                numInit++;
            }        
        }
        return M;
        }
    public static int[][] Ejercioio21(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();//dim=5 numInit=0
        for(int j = 0; j <dim; j++){
            if(j%2==0){
            for (int i = 0; i <dim; i++) {                
                M[i][j]=numInit;
                numInit++; }            
            }else{
            for (int i = dim-1; i >=0; i--) {                
                M[i][j]=numInit;
                numInit++;}            
            }
        }
        return M;
        }
    public static int[][] Ejercicio22(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();//dim=5 numInit=0
        for(int j = 0; j <dim; j++){
            if(j%2==0){
            
            for (int i = dim-1; i >=0; i--) {                
                M[i][j]=numInit;
                numInit++;}            
            }else{
            for (int i = 0; i <dim; i++) {                
                M[i][j]=numInit;
                numInit++; }
        }}
        return M;
        }
    public static int[][] Ejercicio23(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();//dim=5 numInit=0
        for(int j = dim-1; j>=0; j--){
            if(j%2==0){
                for (int i = 0; i <dim; i++) {                
                M[i][j]=numInit;
                numInit++;}      
            }else{
            
                for (int i = dim-1; i >=0; i--) { //              
                M[i][j]=numInit;
                numInit++; }             
            }
        }
        return M;
        }
    public static int[][] Ejercioio24(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();//dim=5 numInit=0
        for(int j = dim-1; j>=0; j--){
            if(j%2==0){
            for (int i = dim-1; i >=0; i--) { //              
                M[i][j]=numInit;
                numInit++; }            
            }else{
            for (int i = 0; i <dim; i++) {                
                M[i][j]=numInit;
                numInit++;}            
            }
        }
        return M;
        }
    public static int[][] Ejercicio25(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();//dim=5 numInit=0
        for(int j = 0; j <dim; j++){
            if(j%2==0){
            for (int i = 0; i <dim; i++) {                
                M[j][i]=numInit;
                numInit++; }            
            }else{
            for (int i = dim-1; i >=0; i--) {                
                M[j][i]=numInit;
                numInit++;}            
            }
        }
        return M;
        }
    public static int[][] Ejercicio26(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();//dim=5 numInit=0
        for(int j = 0; j <dim; j++){
            if(j%2==0){
                for (int i = dim-1; i >=0; i--) {                
                M[j][i]=numInit;
                numInit++;}  
                        
            }else{
                for (int i = 0; i <dim; i++) {                
                M[j][i]=numInit;
                numInit++; }      
            }
        }
        return M;
        }
    public static int[][] Ejercicio29(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=cs.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=cs.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int ls = c; ls <dim-1-c; ls++) {//Superiro direccion derecha
              M[c][ls]=numInit;
              numInit++;
            } 
            for (int ld = c; ld < dim-1-c; ld++) {//Derecho direccion abajo 
              M[ld][dim-1-c]=numInit;
              numInit++;
            }  
            for (int li = dim-1-c; li >c; li--) {//abajo direccion izquierda
              M[dim-1-c][li]=numInit;
              numInit++;
            }
            for (int liz = dim-1-c; liz >c; liz--) {//izquierda direccion arriba 
              M[liz][c]=numInit;
              numInit++;
            }
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }
    public static int[][] Ejercioio30(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=cs.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=cs.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int ld = c; ld < dim-1-c; ld++) {
              M[ld][dim-1-c]=numInit;
              numInit++;
            }
            for (int li = dim-1-c; li >c; li--) {
              M[dim-1-c][li]=numInit;
              numInit++;
            }
            for (int liz = dim-1-c; liz >c; liz--) {
              M[liz][c]=numInit;
              numInit++;
            }
            for (int ls = c; ls <dim-1-c; ls++) {
              M[c][ls]=numInit;
              numInit++;
            }            
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }
     public static int[][] Ejercicio31(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=cs.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=cs.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
             for (int li = dim-1-c; li >c; li--) {//abajo direccion izquierda
              M[dim-1-c][li]=numInit;
              numInit++;
            }
            for (int liz = dim-1-c; liz >c; liz--) {//izquierda direccion arriba 
              M[liz][c]=numInit;
              numInit++;
            }
            for (int ls = c; ls <dim-1-c; ls++) {//Superiro direccion derecha
              M[c][ls]=numInit;
              numInit++;
            }        
            for (int ld = c; ld < dim-1-c; ld++) {//Derecho direccion abajo 
              M[ld][dim-1-c]=numInit;
              numInit++;
            }           
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }
      public static int[][] Ejercicio32(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=cs.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=cs.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int liz = dim-1-c; liz >c; liz--) {//izquierda direccion Arriba 
              M[liz][c]=numInit;
              numInit++;
            }
            for (int ls = c; ls <dim-1-c; ls++) {//Superiro direccion derecha
              M[c][ls]=numInit;
              numInit++;
            }
            for (int ld = c; ld < dim-1-c; ld++) {//Derecho direccion abajo 
              M[ld][dim-1-c]=numInit;
              numInit++;
            }
            for (int li = dim-1-c; li >c; li--) {//inferior direccion izquierda
              M[dim-1-c][li]=numInit;
              numInit++;
            }
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }
       public static int[][] Ejercicio33(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=cs.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=cs.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int liz = dim-1-c; liz >c; liz--) {//superior direccion izquierda 
              M[c][liz]=numInit;
              numInit++;
            }
            for (int lbs = c; lbs <dim-1-c; lbs++) {//abajo  lado  izquierda
              M[lbs][c]=numInit;
              numInit++;
            }
             for (int ld = c; ld < dim-1-c; ld++) {//Derecho direccion abajo 
              M[dim-1-c][ld]=numInit;
              numInit++;
            }
            for (int li = dim-1-c; li >c; li--) {//derecha direccion arriba
              M[li][dim-1-c]=numInit;
              numInit++;
            }
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }
    public static int[][] Ejercioio34(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=cs.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=cs.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int ld = c; ld < dim-1-c; ld++) {
              M[ld][dim-1-c]=numInit;
              numInit++;
            }
            for (int li = dim-1-c; li >c; li--) {
              M[dim-1-c][li]=numInit;
              numInit++;
            }
            for (int liz = dim-1-c; liz >c; liz--) {
              M[liz][c]=numInit;
              numInit++;
            }
            for (int ls = c; ls <dim-1-c; ls++) {
              M[c][ls]=numInit;
              numInit++;
            }            
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }
    public static int[][] Ejercicio35(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=cs.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=cs.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int ld = c; ld < dim-1-c; ld++) {//inferior direccion derecha
              M[dim-1-c][ld]=numInit;
              numInit++;
            }
             for (int li = dim-1-c; li >c; li--) {//derecha direccion arriba
              M[li][dim-1-c]=numInit;
              numInit++;
            }
            for (int liz = dim-1-c; liz >c; liz--) {//superior direccion izquierda
              M[c][liz]=numInit;
              numInit++;
            }
            for (int ls = c; ls <dim-1-c; ls++) {//izquierda direccion abajo
              M[ls][c]=numInit;
              numInit++;
            }                    
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }    
    public static int[][] Ejercicio36(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=cs.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=cs.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){           
           for (int li = dim-1-c; li >c; li--) {//derecha direccion arriba
              M[li][dim-1-c]=numInit;
              numInit++;
            }
            for (int liz = dim-1-c; liz >c; liz--) {//superior direccion izquierda
              M[c][liz]=numInit;
              numInit++;
            }
            for (int ls = c; ls <dim-1-c; ls++) {//izquierda direccion abajo
              M[ls][c]=numInit;
              numInit++;
            } 
            for (int ld = c; ld < dim-1-c; ld++) {//inferior direccion derecha
              M[dim-1-c][ld]=numInit;
              numInit++;
            }
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }
        
    public static void main(String[] args) {
        imprimirMatriz(Ejercicio07());
    }
}
