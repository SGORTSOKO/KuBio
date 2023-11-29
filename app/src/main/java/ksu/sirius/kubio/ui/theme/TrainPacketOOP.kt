package ksu.sirius.kubio.ui.theme

import android.util.Log

interface BaseTrainInterface{
    fun Go() : Int
}

interface TrainInterfaceFirst: BaseTrainInterface{
    override fun Go(): Int {
        return 1
    }
}

interface TrainInterfaceSecond: BaseTrainInterface{
    override fun Go(): Int {
        return 2
    }
}

interface TrainInterfaced: TrainInterfaceFirst, TrainInterfaceSecond{
    override fun Go(): Int {
        var numbers = super<TrainInterfaceFirst>.Go()
        numbers += super<TrainInterfaceSecond>.Go()
        return numbers
    }
}

enum class BaseTrainEnumInt(val value: Int) {
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7);

    fun getDuration(day: BaseTrainEnumInt): Int{
        return value - day.value;
    }
}

enum class BaseTrainEnumString(val value: String) {
    Monday("Monday"),
    Tuesday("Tuesday"),
    Wednesday("Wednesday"),
    Thursday("Thursday"),
    Friday("Friday"),
    Saturday("Saturday"),
    Sunday("Sunday");
}






abstract class BaseTrainClass(innerStringField: String = ".") {
    protected open fun Errorer(message: String = ""){

        Log.d("BaseTrainClass", message)
    }
    var innerStringField: String = ""
        set(newValue){
            when(newValue.length){
                0 -> return
                in 1..10 -> field = newValue
                else -> this.Errorer("Out of range")
            }
            field = newValue
        }
        get(){
            return "Value: $field"
        }
    operator fun contains(input: String): Boolean{
        return when (input in innerStringField){
            true -> true
            false-> false
        }
    }

    operator fun <T> plus (input: T): T where T: BaseTrainClass{
        return input::class.java.getConstructor(String::class.java)
            .newInstance(this.innerStringField + input.innerStringField) as T
    }

    operator fun <T> inc (): T where T: BaseTrainClass{
        return this::class.java.getConstructor(String::class.java)
            .newInstance(this.innerStringField + " ") as T
    }

    operator fun <T> dec (): T where T: BaseTrainClass{
        return this::class.java.getConstructor(String::class.java)
            .newInstance(
                if (this.innerStringField.isNotEmpty())
                    this.innerStringField
                        .substring(0, this.innerStringField.length - 1)
                else this.innerStringField
            ) as T
    }
}

final class BaseTrainClassOverride(newInnerFieldValue: String = "_"):
    BaseTrainClass(newInnerFieldValue), TrainInterfaced{
}

fun BaseTrainClass.symbolCount(symbol: Char) : Int{
    var count = 0
    for(n in this.innerStringField){
        if(n == symbol) count++
    }
    return count
}