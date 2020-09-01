
public class ACOES2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int valor[] = {5,7,4,8,20,21,23,12,13,16,4,7,9,10,22,3,11,9,26,30,25,6,12,7,9,4,10,17};

int media = 0;
for(int i = 0; i<valor.length; i++) {
media+= valor[i];

}
float total = (float)media/ valor.length;


System.out.println(" A média mensal dos valores das ações é: "+total);
}
}

