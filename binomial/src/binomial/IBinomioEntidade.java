package binomial;

public interface IBinomioEntidade {

	int calcular(int i, int j);

	void setN(int i);

	void setK(int i);

	int getCoeficiente();
}