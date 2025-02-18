import java.util.*;
abstract class JobRole{
  private String candidateName;
  private int yearsOfExperience;
  private double skillScore;

  public JobRole(String candidateName, int yearsOfExperience, double skillScore) {
    this.candidateName = candidateName;
    this.yearsOfExperience = yearsOfExperience;
    this.skillScore = skillScore;
  }

  public String getCandidateName() {
    return candidateName;
  }

  public int getYearsOfExperience() {
    return yearsOfExperience;
  }

  public double getSkillScore() {
    return skillScore;
  }

  public abstract void displayResume();
}

class SoftwareEngineer extends JobRole {
  public SoftwareEngineer(String candidateName, int yearsOfExperience, double skillScore) {
    super(candidateName, yearsOfExperience, skillScore);
  }

  @Override
  public void displayResume() {
    System.out.println(
        "Software Engineer Resume - "
            + getCandidateName()
            + " | Experience: "
            + getYearsOfExperience()
            + " years"
            + " | Skill Score: "
            + getSkillScore());
  }
}

class DataScientist extends JobRole {
  public DataScientist(String candidateName, int yearsOfExperience, double skillScore) {
    super(candidateName, yearsOfExperience, skillScore);
  }

  @Override
  public void displayResume() {
    System.out.println(
        "Data Scientist Resume - "
            + getCandidateName()
            + " | Experience: "
            + getYearsOfExperience()
            + " years"
            + " | Skill Score: "
            + getSkillScore());
  }
}

class ProductManager extends JobRole {
  public ProductManager(String candidateName, int yearsOfExperience, double skillScore) {
    super(candidateName, yearsOfExperience, skillScore);
  }

  @Override
  public void displayResume() {
    System.out.println(
        "Product Manager Resume - "
            + getCandidateName()
            + " | Experience: "
            + getYearsOfExperience()
            + " years"
            + " | Skill Score: "
            + getSkillScore());
  }
}

class Resume<T extends JobRole> {
  private List<T> resumes = new ArrayList<>();

  public void addResume(T resume) {
    resumes.add(resume);
  }

  public List<T> getAllResumes() {
    return resumes;
  }
}

class ResumeScreening {
  public static void screenResumes(
      List<? extends JobRole> resumes, double minExperience, double minSkillScore) {
    System.out.println(
        "Screening Resumes (Min Exp: "
            + minExperience
            + " years, Min Skill Score: "
            + minSkillScore
            + ")\n");

    for (JobRole resume : resumes) {
      if (resume.getYearsOfExperience() >= minExperience
          && resume.getSkillScore() >= minSkillScore) {
        resume.displayResume();
        System.out.println("Passed Screening");
      } else {
        resume.displayResume();
        System.out.println("Rejected");
      }
    }
  }
}

public class ResumeScreener {
  public static void main(String[] args) {
    Resume<SoftwareEngineer> softwareEngineerResumes = new Resume<>();
    softwareEngineerResumes.addResume(new SoftwareEngineer("Aditya", 5, 8.5));
    softwareEngineerResumes.addResume(new SoftwareEngineer("Abhay", 2, 6.0));

    Resume<DataScientist> dataScientistResumes = new Resume<>();
    dataScientistResumes.addResume(new DataScientist("Dhruv", 4, 7.5));
    dataScientistResumes.addResume(new DataScientist("Divyansh", 6, 9.0));

    Resume<ProductManager> productManagerResumes = new Resume<>();
    productManagerResumes.addResume(new ProductManager("Utkarsh", 8, 9.2));
    productManagerResumes.addResume(new ProductManager("Krishna", 3, 5.5));
	
    ResumeScreening.screenResumes(softwareEngineerResumes.getAllResumes(), 3, 7.0);
    ResumeScreening.screenResumes(dataScientistResumes.getAllResumes(), 4, 7.5);
    ResumeScreening.screenResumes(productManagerResumes.getAllResumes(), 5, 8.0);
  }
}