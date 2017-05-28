package com.iconplus.tp4.service.entity.list;

import com.iconplus.tp4.service.entity.Marquee;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by mrapry on 4/20/17.
 */
@XmlRootElement(name = "ROWSET")
public class ListMarquee {

    private List<Marquee> marqueeList;

    public List<Marquee> getMarqueeList() {
        return marqueeList;
    }

    @XmlElement(name = "ROW")
    public void setMarqueeList(List<Marquee> marqueeList) {
        this.marqueeList = marqueeList;
    }

    @Override
    public String toString() {
        return "ListMarquee{" +
                "marqueeList=" + marqueeList +
                '}';
    }
}
