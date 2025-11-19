public class agendamentos {

    // Classe interna Agendamento, responsável por representar um único agendamento
    public class Agendamento {

        // Nome do cliente que fez o agendamento
        private String nomeCliente;

        // Tipo de corte escolhido pelo cliente
        private String tipoCorte;

        // Data do agendamento (ex.: 20/11/2025)
        private String data;

        // Horário do agendamento (ex.: 14:00)
        private String hora;

        /**
         * Construtor da classe Agendamento.
         * Inicializa os atributos com os valores informados.
         *
         * @param nomeCliente Nome do cliente
         * @param tipoCorte Tipo de corte solicitado
         * @param data Data marcada
         * @param hora Horário marcado
         */
        public Agendamento(String nomeCliente, String tipoCorte, String data, String hora) {
            this.nomeCliente = nomeCliente;
            this.tipoCorte = tipoCorte;
            this.data = data;
            this.hora = hora;
        }

        // Retorna o nome do cliente
        public String getNomeCliente() {
            return nomeCliente;
        }

        // Retorna o tipo de corte escolhido
        public String getTipoCorte() {
            return tipoCorte;
        }

        // Retorna a data do agendamento
        public String getData() {
            return data;
        }

        // Retorna o horário do agendamento
        public String getHora() {
            return hora;
        }

        /**
         * Sobrescreve o método toString().
         * Retorna uma representação amigável do agendamento,
         * usando emojis para facilitar a visualização.
         */
        @Override
        public String toString() {
            return "👤 Cliente: " + nomeCliente +
                   " | ✂️ Corte: " + tipoCorte +
                   " | 📅 Data: " + data +
                   " | ⏰ Hora: " + hora;
        }
    }
}
