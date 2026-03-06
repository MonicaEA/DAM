package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

@XmlAccessorType(XmlAccessType.FIELD)


public class Libreria {
    @XmlElement(name = "libro")
    private List<Libro> libros;

    public Libreria() {

    }
}
