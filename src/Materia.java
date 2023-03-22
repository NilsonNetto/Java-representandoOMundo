public class Materia {
  private String nome;
  private String professor;
  private double nota;
  private boolean aprovado;
  Conteudo conteudo = new Conteudo();

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setProfessor(String professor) {
    this.professor = professor;
  }

  public String getProfessor() {
    return this.professor;
  }

  public void setNota(double nota) {
    this.nota = nota;
    verifyAprovado();
  }

  public double getNota() {
    return this.nota;
  }

  private void verifyAprovado() {
    if (this.nota >= 6.00) {
      this.aprovado = true;
    } else {
      this.aprovado = false;
    }
  }

  public boolean getAprovado() {
    return this.aprovado;
  }
}