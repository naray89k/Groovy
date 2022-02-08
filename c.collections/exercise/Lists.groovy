/*
 List Exercise 
 ---------------------------------

    Create a list days (Sun - Sat)
    Print out the list
    Print the size of the list
    Remove Saturday from the list
    Add Saturday back by appending it to the list
    Print out the Wednesday using its index
    
*/

def days = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"]
println days
println(days.getClass().getName())

days.add("Saturday")
days << "Sample_element"
println(days)
println(days.size())

// pop deletes the first element from list
println(days.pop())
println(days)
println days[3]

// Testing one line code blocks .....
def numbers_list = []
Range r = 1..100
for (elem in r)
  if (elem % 5 == 0)
    numbers_list.add(elem)
  else
    println("Skipping ${elem}")
println(numbers_list)


// Set Examples .....
Set stringSet = ["Narayanan", "Krishnan", "Krishnan"]
println("Size of Set:${stringSet.size()}")
for (elem in stringSet)
  println(elem)


// Functions with strict return type ...
Boolean validate_string(name){
  if (name instanceof String)
    return true
  return false
}

println(validate_string("Narayanan"))
println(validate_string(100))


/* ===================================================
                        MAP
   =================================================== */
enum Months {
  1JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER
}

Months()