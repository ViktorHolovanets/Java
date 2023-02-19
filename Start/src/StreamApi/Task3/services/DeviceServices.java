package StreamApi.Task3.services;

import StreamApi.Task3.models.Device;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeviceServices {
    private ArrayList<Device> devices;
    public DeviceServices(ArrayList<Device> devices){
        this.devices=devices;
    }
    public DeviceServices(){
        this(new ArrayList<>());
    }
    public ArrayList<Device> getAllDevices(){
        return devices;
    }
    public ArrayList<Device> getDevicesColor(String color){
        return getArrayListFromStream(devices.stream().filter(d->d.getColor().equalsIgnoreCase(color)));
    }
    public ArrayList<Device> getDevicesYear(int year){
        return getArrayListFromStream(devices.stream().filter(d->d.getYear()==year));
    }
    public ArrayList<Device> getDevicesMoreExpensive(double price){
        return getArrayListFromStream(devices.stream().filter(d->d.getPrice()>price));
    }
    public ArrayList<Device> getDevicesType(String type){
        return getArrayListFromStream(devices.stream().filter(d->d.getType().equalsIgnoreCase(type)));
    }
    public ArrayList<Device> getDevicesRangeYear(int start, int end){
        return getArrayListFromStream(devices.stream().filter(d->d.getYear()>start&&d.getYear()<end));
    }
    public  ArrayList<Device>
    getArrayListFromStream(Stream<Device> stream)
    {
        // Convert the Stream to ArrayList
        return stream
                .collect(Collectors
                        .toCollection(ArrayList::new));
    }
}
