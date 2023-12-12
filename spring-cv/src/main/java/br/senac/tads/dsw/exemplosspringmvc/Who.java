package br.senac.tads.dsw.exemplosspringmvc;

public class Who {
    
    private int id, age;
    private String name, surname, birth, num, linkedin, github;
    private String[] skills, experiences, experiencesDescription, schools, schoolsDescription, idiomes, idiomesDescription;

    public Who(int id, String name, String surname, int age, String birth, String num, String linkedin, String github, String[] skills, String[] experiences, String[] experiencesDescription, String[] schools, String[] schoolsDescription, String[] idiomes, String[] idiomesDescription) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birth = birth;
        this.num = num;
        this.linkedin = linkedin;
        this.github = github;
        this.skills = skills;
        this.experiences = experiences;
        this.experiencesDescription = experiencesDescription;
        this.schools = schools;
        this.schoolsDescription = schoolsDescription;
        this.idiomes = idiomes;
        this.idiomesDescription = idiomesDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
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

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String[] getExperiences() {
        return experiences;
    }

    public void setExperiences(String[] experiences) {
        this.experiences = experiences;
    }

    public String[] getExperiencesDescription() {
        return experiencesDescription;
    }

    public void setExperiencesDescription(String[] experiencesDescription) {
        this.experiencesDescription = experiencesDescription;
    }

    public String[] getSchools() {
        return schools;
    }

    public void setSchools(String[] schools) {
        this.schools = schools;
    }

    public String[] getSchoolsDescription() {
        return schoolsDescription;
    }

    public void setSchoolsDescription(String[] schoolsDescription) {
        this.schoolsDescription = schoolsDescription;
    }

    public String[] getIdiomes() {
        return idiomes;
    }

    public void setIdiomes(String[] idiomes) {
        this.idiomes = idiomes;
    }

    public String[] getIdiomesDescription() {
        return idiomesDescription;
    }

    public void setIdiomesDescription(String[] idiomesDescription) {
        this.idiomesDescription = idiomesDescription;
    }
}