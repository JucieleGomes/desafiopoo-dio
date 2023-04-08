import one.digitalinnovation.No;

public class Pilha {

    private No refNoEntradaPilha;
    private Object Pilha;

    public Pilha() {

        this.refNoEntradaPilha = null;

    }

    public void push (No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setReNo(refAuxiliar);

    }

    public No pop (){
        if(this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getReNo();
            return noPoped;

        }
        return null;


    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {
        if (refNoEntradaPilha == null) {
            return true;
        }
        return false;
    }


    @Override

    public String toString(){

        String stringRetorno = "_________________\n";
        stringRetorno += Pilha\n;
        stringRetorno ++ ____________________\n;

        No noAuxiliar = refNoEntradaPilha;

        while (true){

            if(noAuxiliar != null){
                stringRetorno+= "[No{dado="+ noAuxiliar.getDado() +"}]\n";
                noAuxiliar = noAuxiliar.getReNo();

            } else {
                break;
            }
        }

        stringRetorno += ____________________\n;
        return stringRetorno;

    }
}
