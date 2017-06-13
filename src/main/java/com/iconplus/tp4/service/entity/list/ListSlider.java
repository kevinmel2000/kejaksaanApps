package com.iconplus.tp4.service.entity.list;

import com.iconplus.tp4.service.entity.Slider;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by mrapry on 6/2/17.
 */
@XmlRootElement(name = "ROWSET")
public class ListSlider {
    private List<Slider> sliderList;

    public List<Slider> getSliderList() {
        return sliderList;
    }

    @XmlElement(name = "ROW")
    public void setSliderList(List<Slider> sliderList) {
        this.sliderList = sliderList;
    }

    @Override
    public String toString() {
        return "ListSlider{" +
                "sliderList=" + sliderList +
                '}';
    }
}
