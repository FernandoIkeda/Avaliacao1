package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @Fernando 
 */
public class Complexo {
    private double real;
    private double img;

    public Complexo() {
        this.real = 0.0;
        this.img = 0.0;
    }

    public Complexo(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public double getReal() {
        return real;
    }

    public double getImg() {
        return img;
    }

    public Complexo soma(Complexo c) {
        return new Complexo(real + c.real, img + c.img);
    }
    
    public Complexo sub(Complexo c) {
        return new Complexo (real - c.real, img - c.img);
    }

    public Complexo prod(double real) {
        Complexo cnovo = new Complexo();
        cnovo.real = real * real;
        cnovo.img = img * real;
        return cnovo;
    }

    public Complexo prod(Complexo c) {
        Complexo cprod = new Complexo();
        cprod.real = real * c.real - img * c.img;
        cprod.img = real * c.img + img * c.real;
        return cprod;
    }
    
    public Complexo div(Complexo c) {
        Complexo cdiv = new Complexo();
        cdiv.real = (real * c.real + img * c.img)/(c.real * c.real + c.img * c.img);
        cdiv.img = (real * c.img - img * c.real)/(c.real * c.real + c.img * c.img);
        return cdiv;
    }
    
    // implementar sqrt()
    public Complexo[] sqrt() {
        Complexo craiz = new Complexo();
        if (real > 0) {
        craiz.real = Math.sqrt(Math.sqrt(real * real + img * img)) * Math.cos(Math.atan(img/real)/2) + c.(Math.sen(Math.atan(img/real)/2));
        craiz.img = Math.sqrt(Math.sqrt(real * real + img * img)) * Math.cos((Math.atan(img/real) + Math.PI)/2) + c.(Math.sen((Math.atan(img/real) + Math.PI)/2));
        return craiz;
        }
        else if (real < 0) {
        craiz.real = Math.sqrt(Math.sqrt(real * real + img * img)) * Math.cos((Math.atan(img/real) + Math.PI)/2) + c.(Math.sen(Math.atan(img/real) + Math.PI)/2));
        craiz.img = Math.sqrt(Math.sqrt(real * real + img * img)) * Math.cos((Math.atan(img/real) + Math.PI) + Math.PI/2) + c.(Math.sen(Math.atan(img/real) + Math.PI) + Math.PI/2));
        return craiz;
        }
        else if (img > 0) {
        craiz.real = Math.sqrt(Math.sqrt(real * real + img * img)) * Math.cos(Math.PI/4) + c.(Math.sen(Math.PI/4));
        craiz.img = Math.sqrt(Math.sqrt(real * real + img * img)) * Math.cos(5 * Math.PI/4) + c.(Math.sen(5 * Math.PI/4));
        return craiz;
        }
        else if (real < 0) {
        craiz.real = Math.sqrt(Math.sqrt(real * real + img * img)) * Math.cos(3 * Math.PI/4) + c.(Math.sen(3 * Math.PI/4));
        craiz.img = Math.sqrt(Math.sqrt(real * real + img * img)) * Math.cos(7 * Math.PI/4) + c.(Math.sen(7 * Math.PI/4));
        return craiz;
        }
        else {
        craiz.real = Math.sqrt(Math.sqrt(real * real + img * img)) * Math.cos(0) + c.(Math.sen(0));
        craiz.img = Math.sqrt(Math.sqrt(real * real + img * img)) * Math.cos(Math.PI) + c.(Math.sen(Math.PI));
        return craiz;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (Double.doubleToLongBits(real)
            ^ (Double.doubleToLongBits(real) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(img)
            ^ (Double.doubleToLongBits(img) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        final Complexo c = (Complexo) obj;
        return obj != null && getClass() == obj.getClass()
            && real == c.real && img == c.img;
    }

    @Override
    public String toString() {
        return String.format("%+f%+fi", real, img);
    }
}
