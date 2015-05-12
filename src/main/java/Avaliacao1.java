import utfpr.ct.dainf.if62c.avaliacao.Complexo;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @Fernando
 */
public class Avaliacao1 {

    public static void main(String[] args) {
        Complexo aX, aY, bX, bY, cX, cY;
        Complexo[] respostaX = new Complexo[2];
        Complexo[] respostaY = new Complexo[2];
        
        aX = new Complexo(1, 0);
        bX = new Complexo(5, 0);
        cX = new Complexo(4, 0);
        
        aY = new Complexo(1, 0);
        bY = new Complexo(2, 0);
        cY = new Complexo(5, 0);
        
        respostaX = raizesEquacao(aX, bX, cX);
        respostaY = raizesEquacao(aY, bY, cY);
        
        System.out.println("x1 = " + respostaX[0].toString() + "\n");
        System.out.println("x2 = " + respostaX[1].toString() + "\n");
        
        System.out.println("y1 = " + respostaY[0].toString() + "\n");
        System.out.println("y2 = " + respostaY[1].toString() + "\n");
        
    }
    
    public static Complexo[] raizesEquacao(Complexo a, Complexo b, Complexo c) {
        Complexo[] vetor = new Complexo[2];
        Complexo[] raiz = new Complexo[2];        
        Complexo delta = new Complexo();
        
        delta = b.prod(b).sub(a.prod(c.prod(4)));
        
        raiz = delta.sqrt();
        
        vetor[0] = (b.prod(-1).soma(raiz[0])).div(a.prod(2));
        vetor[1] = (b.prod(-1).soma(raiz[1])).div(a.prod(2));
        
        return vetor;
    }
        
}