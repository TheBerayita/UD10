package Ej5;

public class Password {

		final static int LONG_DEF=8;

		private int longitud;

		private String contrase�a;

		public int getLongitud() {
			return longitud;
		}

		public void setLongitud(int longitud) {
			this.longitud = longitud;
		}

		public String getContrase�a() {
			return contrase�a;
		}

		public String generaPassword (){
			String password="";
			for (int i=0;i<longitud;i++){
				int eleccion=((int)Math.floor(Math.random()*3+1));

				if (eleccion==1){
					char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
					password+=minusculas;
				}else{
					if(eleccion==2){
						char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
						password+=mayusculas;
					}else{
						char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
						password+=numeros;
					}
				}
			}
			return password;
		}

		public boolean esFuerte(){
			int cuentanumeros=0;
			int cuentaminusculas=0;
			int cuentamayusculas=0;
			for (int i=0;i<contrase�a.length();i++){
				if (contrase�a.charAt(i)>=97 && contrase�a.charAt(i)<=122){
					cuentaminusculas+=1;
				}else{
					if (contrase�a.charAt(i)>=65 && contrase�a.charAt(i)<=90){
						cuentamayusculas+=1;
					}else{
						cuentanumeros+=1;
					}
				}
			}
			if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2){
				return true;
			}else{
				return false;
			}
		}


		public Password (){
			this(LONG_DEF);
		}

		public Password (int longitud){
			this.longitud=longitud;
			contrase�a=generaPassword();
		}
	}