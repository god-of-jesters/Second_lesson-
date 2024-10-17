fun main(args: Array<String>) {
    val student:Student? = Student()
    val student1 = student?.let {st ->
        st.hi()
        st.bye()
    }
    println(student?.name)
    val student2 = student?.apply {
        name = "Kola"
    }
    println(student?.name)
    println(student2?.name)
    val f = Student().run {
        hi()
        bye()
        name = "Dima"
        age
    }
    println(f)
}