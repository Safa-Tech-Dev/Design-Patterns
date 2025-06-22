package creational.design.pattern.prototype;

public interface Prototype extends Cloneable{

    Prototype clone() throws CloneNotSupportedException;
}
