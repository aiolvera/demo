public class Hola {

	public Hola(){
	}
	public static void main(String[] args){
		Hola hola = new Hola();
		String usuario = "defecto";
		if(args.length > 0){
			usuario = args[0];
		}
		hola.mensaje(usuario);
	}

	public void mensaje(String mensaje){
		System.out.println("Hola Mundo y " + mensaje);
	}
}
