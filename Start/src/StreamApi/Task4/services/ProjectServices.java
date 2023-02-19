package StreamApi.Task4.services;

import StreamApi.Task3.models.Device;
import StreamApi.Task4.models.Project;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProjectServices {
    private ArrayList<Project> projects;
    public ProjectServices(ArrayList<Project> projects){
        this.projects=projects;
    }
    public ProjectServices(){
        this(new ArrayList<Project>());
    }
    public  ArrayList<Project>
    getArrayListFromStream(Stream<Project> stream)
    {
        // Convert the Stream to ArrayList
        return stream
                .collect(Collectors
                        .toCollection(ArrayList::new));
    }
    public ArrayList<Project> getAllProjects(){
        return projects;
    }
    public ArrayList<Project> getProjectsManufacture(String manufacture){
        return getArrayListFromStream(projects.stream().filter(d->d.getManufacturer().equalsIgnoreCase(manufacture)));
    }
    public ArrayList<Project> getProjectsYearNow(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return getArrayListFromStream(projects.stream().filter(d->d.getYear()==year));
    }
    public ArrayList<Project> getProjectsMoreExpensive(double price){
        return getArrayListFromStream(projects.stream().filter(d->d.getPrice()>price));
    }
    public ArrayList<Project> getProjectsSortPriceAsc(){
        return getArrayListFromStream(projects.stream().sorted(Comparator.comparingDouble(Project::getPrice)));
    }
    public ArrayList<Project> getProjectsSortPriceDesc(){
        return getArrayListFromStream(projects.stream().sorted(Comparator.comparingDouble(Project::getPrice).reversed()));
    }
    public ArrayList<Project> getProjectsSortYearAsc(){
        return getArrayListFromStream(projects.stream().sorted(Comparator.comparingInt(Project::getYear)));
    }
    public ArrayList<Project> getProjectsSortYearDesc(){
        return getArrayListFromStream(projects.stream().sorted(Comparator.comparingInt(Project::getYear).reversed()));
    }
}
