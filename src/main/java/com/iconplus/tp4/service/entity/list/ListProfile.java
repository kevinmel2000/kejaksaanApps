package com.iconplus.tp4.service.entity.list;



import com.iconplus.tp4.service.entity.Profile;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by mrapry on 4/18/17.
 */
@XmlRootElement(name = "ROWSET")
public class ListProfile {
    private List<Profile> profileList;

    public List<Profile> getProfileList(){
        return profileList;
    }

    @XmlElement(name = "ROW")
    public void setProfileList(List<Profile> profileList){
        this.profileList = profileList;
    }

    @Override
    public String toString() {
        return "ListProfile{" +
                "profileList=" + profileList +
                '}';
    }
}
