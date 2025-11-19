public class Agendamento {

    // Nome do cliente que fez o agendamento
    private String nomeCliente;

    // Tipo de corte solicitado no agendamento
    private String tipoCorte;

    // Data do agendamento (formato pode ser dd/MM/yyyy)
    private String data;

    // Horário do agendamento (ex: 14:30)
    private String hora;

    /**
     * Construtor da classe Agendamento.
     * Recebe os dados necessários para criar um novo agendamento.
     *
     * @param nomeCliente Nome do cliente
     * @param tipoCorte Tipo de corte escolhido
     * @param data Data marcada para o atendimento
     * @param hora Horário marcado
     */
    public Agendamento(String nomeCliente, String tipoCorte, String data, String hora) {
        this.nomeCliente = nomeCliente;
        this.tipoCorte = tipoCorte;
        this.data = data;
        this.hora = hora;
    }

    /**
     * Sobrescrita do método toString().
     * Retorna uma representação textual do objeto Agendamento,
     * facilitando a exibição dos dados na tela.
     */
    @Override
    public String toString() {
        return "Cliente: " + nomeCliente 
             + " | Corte: " + tipoCorte 
             + " | Data: " + data 
             + " | Hora: " + hora;
    }
}
