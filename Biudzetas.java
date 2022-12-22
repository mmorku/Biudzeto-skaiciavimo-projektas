import java.util.Arrays;

public class Biudzetas {
    private int pajamuSuma = 0;
    private int islaiduSuma = 0;

    PajamuIrasas[] pajamos = new PajamuIrasas[100];
    IslaiduIrasas[] islaidos = new IslaiduIrasas[100];

    private int pajamuIrasuSuma = 0;
    private int islaiduuIrasuSuma = 0;


    public void pridetiPajamuIsrasa(PajamuIrasas pajamuIrasas) {
        if (pajamuIrasuSuma == pajamos.length) {
            throw new ArrayIndexOutOfBoundsException("Pajamų sąrašas pilnas, pašalinkite dalį sąrašo ir kartokite iš naujo.");
        }
        pajamos[pajamuIrasuSuma] = pajamuIrasas;
        pajamuIrasuSuma++;
        System.out.println(Arrays.toString(pajamos));
    }

    public void pridetiIslaiduIsrasa(IslaiduIrasas islaiduIrasas) {
        if (islaiduuIrasuSuma == islaidos.length) {
            throw new ArrayIndexOutOfBoundsException("Išlaidų sąrašas pilnas, pašalinkite dalį sąrašo ir kartokite iš naujo.");
        }
        islaidos[islaiduuIrasuSuma] = islaiduIrasas;
        islaiduuIrasuSuma++;
        System.out.println(Arrays.toString(islaidos));
    }

    public void gautiPajamuIsrasa() {
        if (pajamuIrasuSuma == 0) {
            throw new NullPointerException("Pajamų sąrašas tuščias.");
        }
        for (PajamuIrasas PajamuIrasas : pajamos) {
            System.out.printf("Pajamų sąrašas: %s \n", PajamuIrasas);
            for (int i = 0; i < pajamos.length; i++) {
                pajamuSuma += PajamuIrasas.getSuma();
            }
            System.out.printf("Pajamų sąrašo suma: %s \n", pajamuSuma);
        }
    }

    public void gautiIslaiduIsrasa() {
        if (islaiduuIrasuSuma == 0) {
            throw new ArrayIndexOutOfBoundsException("Išlaidų sąrašas tuščias.");
        }
        for (IslaiduIrasas IslaiduIrasas : islaidos) {
            System.out.printf("Išlaidų sąrašas: %s \n", IslaiduIrasas);
            for (int i = 0; i < islaidos.length; i++) {
                islaiduSuma += IslaiduIrasas.getSuma();
            }
            System.out.printf("Išlaidų sąrašo suma: %s \n", islaiduSuma);
        }
    }
}
