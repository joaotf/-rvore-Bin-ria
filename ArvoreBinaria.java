package ArvoreBinaria;
public class ArvoreBinaria {
    AB_No raiz = new AB_No(0);
    
    
    public void inicializar(int root){
        this.raiz = new AB_No(root);
    }
    public void inserir(AB_No node , int valor){
        if(node != null){
            if(valor < node.dado){
                if(node.No_esquerdo != null){
                    inserir(node.No_esquerdo , valor);
                }else{
                    System.out.println("Inserindo " + valor+" a esquerda de "+node.dado+".");
                    node.No_esquerdo = new AB_No(valor);
                }
            }else if(valor > node.dado){
                if(node.No_direito != null){
                    inserir(node.No_direito ,valor);
                }else{
                    System.out.println("  Inserindo "+valor + "  a direita de "+ node.dado + ".");
                }
            } 
        }
    }
    public void prefixado(AB_No no){
        if(no != null){
            System.out.println(no.dado + " ");
            prefixado(no.No_esquerdo);
            prefixado(no.No_direito);
        }
    }
    public void posfixado(AB_No no){
        if(no != null){
            posfixado(no.No_esquerdo);
            posfixado(no.No_direito);
            System.out.println(no.dado + " ");
        }
    }
    public void emordem(AB_No no){
        if(no != null){
            emordem(no.No_esquerdo);
            System.out.println(no.dado + " ");
            emordem(no.No_direito);
        }
    }
}
