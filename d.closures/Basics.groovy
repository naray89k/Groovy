def c = { }

println c.class.name
println c instanceof Closure

def sayHello = { name ->
    println "Hello, $name"
}

sayHello('Dan')

List nums = [1,4,7,4,30,2]
nums.each { num ->
    println(num)
}

// closures are objects & last param

def timesTen(num,closure) {
    closure(num * 10)
}

timesTen(10, { println it })
timesTen(2) { 
    println it 
}

10.times { 
    println it
}

import java.util.Random

Random rand = new Random()

3.times {
    println rand.nextInt()
}


def temp_closure = {
    branch_name, hash, project, new_branch_name ->
        println("Inside Closure")
        println(branch_name)
        println(hash)
        println(project)
        println(new_branch_name)
}

temp_closure("development","asdf","Bluetooth","release")

def method(){
    branches = [:]
    base_branch = "development"
    new_branch = "release"
    projects = [Bluetooth:"asdf", Common:"ghjk", Wlan:"qwer", Hardware_definitions:"tyui"]
    projects.each {project, hash ->
        branches[project] = {
            println(project)
            println(hash)
            println(base_branch)
            println(new_branch)
        }
    }
    branches.each{it.call()}
    //println(branches)
}
