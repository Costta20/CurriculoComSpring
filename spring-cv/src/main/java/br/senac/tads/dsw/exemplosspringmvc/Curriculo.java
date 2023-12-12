package br.senac.tads.dsw.exemplosspringmvc;

/**
 *
 * @author costta20
 */
public class Curriculo {
    private int id, idade;
    private String nome, sobrenome, dataNascimento, telCelular, linkedin, github;
    private String[] conhecimentos, experiencias, escolaridade, idiomas;

    public Curriculo(int id, int idade, String nome, String sobrenome, String dataNascimento, String telCelular, String linkedin, String github, String[] conhecimentos, String[] experiencias, String[] escolaridade, String[] idiomas) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.telCelular = telCelular;
        this.linkedin = linkedin;
        this.github = github;
        this.conhecimentos = conhecimentos;
        this.experiencias = experiencias;
        this.escolaridade = escolaridade;
        this.idiomas = idiomas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String[] getConhecimentos() {
        return conhecimentos;
    }

    public void setConhecimentos(String[] conhecimentos) {
        this.conhecimentos = conhecimentos;
    }

    public String[] getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(String[] experiencias) {
        this.experiencias = experiencias;
    }

    public String[] getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String[] escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }
}