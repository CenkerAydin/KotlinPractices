package ToDoList

import java.util.Scanner

data class Task(val id:Int, var content:String, var done:Boolean=false)

class ToDo{
    private val tasks= mutableListOf<Task>()
    private var lastTaskId=0

    fun addTask(taskContent:String){
        val newTask=Task(++lastTaskId,taskContent)
        tasks.add(newTask)
        println("Yeni görev eklendi $lastTaskId. Görev: $taskContent")
    }

    fun updateTask(taskId:Int, newContent:String){
        val task=tasks.find { it.id ==taskId}
        if (task !=null){
            task.content=newContent
            println("Görev Güncellendi $taskId. Görev: $newContent")
        }else{
            println("Görev bulunamadı.")
        }
    }

    fun completeTask(taskId:Int){
        val task=tasks.find { it.id ==taskId}
        if (task != null){
            task.done=true
            println("Görev tamamlandı $taskId. Görev:  ${task.content}")
        }else{
            println("Görev bulunamadı.")
        }
    }

    fun deleteTask(taskId:Int){
        val task=tasks.find { it.id==taskId }
        if (task !=null){
            tasks.remove(task)
            println("Görev silindi $taskId. Görev ${task.content}")
        }else{
            println("Görev bulunamadı.")
        }
    }

    fun showTasks(){
        if (tasks.isEmpty()){
            println("Yapılacak iş yok.")
        }else{
            println("Yapılacak İşler:")
            for (task in tasks){
                val status=if (task.done) "[Tamamlandı]" else "[Tamamlanmadı]"
                println("${task.id}. $status ${task.content}")
            }
        }
    }
}

fun main(){
    val toDoList =ToDo()
    val scanner=Scanner(System.`in`)

    while (true){
        println("\n ToDo List App")
        println("1. Yeni görev ekle")
        println("2. Görev güncelle")
        println("3. Görevi tamamla")
        println("4. Görevi sil")
        println("5. Görevleri göster")
        println("0. Çıkış yap")
        print("Seçiminizi yapın: ")

        when(scanner.nextInt()){
            1 -> {
                print("Yeni görevi girin: ")
                scanner.nextLine()
                val taskContent=scanner.nextLine()
                toDoList.addTask(taskContent)
            }
            2 ->{
                print("Görev ID'sini giriniz: ")
                val taskId=scanner.nextInt()
                print("Yeni görev içeriğini giriniz: ")
                scanner.nextLine()
                val taskContent=scanner.nextLine()
                toDoList.updateTask(taskId,taskContent)
            }
            3 -> {
                println("Görev ID'sini giriniz: ")
                val taskId=scanner.nextInt()
                toDoList.completeTask(taskId)
            }
            4 -> {
                println("Görev ID'sini giriniz: ")
                val taskId=scanner.nextInt()
                toDoList.deleteTask(taskId)
            }
            5 ->{
                toDoList.showTasks()
            }
            0 -> {
                println("Çıkış Yapılıyor...")
                return
            }
            else -> println("Geçersiz seçim, tekrar deneyin.")
        }
    }
}