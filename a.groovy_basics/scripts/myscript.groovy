// a script is any groovy code not enclosed in a class file
// but don't make the mistake thinking there is no class
println "Hello from myscript.groovy"


class Shape{
    static int i
    String name
    Integer age

    def sum(num){
        return num + 1
    }
}