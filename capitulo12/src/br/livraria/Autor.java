package br.livraria;

public class Autor {
        private String nome;
        private String email;


        private String cpf;

        public void showDetails(){
                System.out.println("Nome autor(a): "+nome);
                System.out.println("Email: "+email);
                System.out.println("CPF: "+cpf);
        }

        @Override
        public boolean equals(Object object){
                /*Autor outro;
                try {
                        outro = (Autor) object;
                }catch (ClassCastException e){
                        return false;
                }*/
                if(!(object instanceof Autor)) return false;
                Autor outro = (Autor) object;

                return this.nome.equals(outro.nome);
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getCpf() {
                return cpf;
        }

        public void setCpf(String cpf) {
                this.cpf = cpf;
        }



        

}
