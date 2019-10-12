
package ArvoreBinaria;

import javax.swing.JOptionPane;

public class ABExecutar {
    public static void main(String args[]) {
    int op;

     ArvoreBinaria arvore = new ArvoreBinaria();
     int root = Integer.parseInt(JOptionPane.showInputDialog("Digite a raiz da arvore"));
    
     arvore.inicializar(root);
    
     do
     {
       op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção \n 0) Sair \n 1)Inserir Nó \n 2)Caminhamento Pré-Fixado \n"
               + "3)Caminhamento In-Fixado \n 4)Caminhamento Pós-Fixado"));  
       switch(op){
           case 1:
               int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
               arvore.inserir(arvore.raiz,num);
               break;
           case 2: 
               System.out.println("CAMINHAMENTO PRÉ-FIXADO:");
               arvore.prefixado(arvore.raiz);
               System.out.println("\n");
               break;
           case 3: 
               System.out.println("CAMINHAMENTO IN-FIXADO");
               arvore.emordem(arvore.raiz);
               System.out.println("\n");
               break;
           case 4:
               System.out.println("CAMINHAMENTO PÓS-FIXADO");
               arvore.posfixado(arvore.raiz);
               System.out.println("\n");
               break;
       }
     }while(op != 0);
    }
}
