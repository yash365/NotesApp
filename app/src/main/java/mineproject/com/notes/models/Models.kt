package mineproject.com.notes.models

// kotlin automatically creates getters and setters

// data keywords automatically adds overide methods
// JvmOverloads is used like method overloading like in java
data class Task @JvmOverloads constructor(
    var title: String,
    val todos: MutableList<Todo> = mutableListOf(),         // creates an empty list and MutableList is able to create list
    var tag: Tag? = null
)

data class Todo(
    var description: String,
    var isComplete: Boolean
)

data class Note(
    var description:String,
    var tag: Tag? = null
)

data class Tag(
    val name: String,
    val colourResId: Int
)




