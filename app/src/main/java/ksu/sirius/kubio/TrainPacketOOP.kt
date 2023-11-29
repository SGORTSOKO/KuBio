package ksu.sirius.kubio

import android.util.Log
import kotlin.reflect.KProperty

interface BaseTrainInterface{
    fun Go() : Int
}

interface TrainInterfaceFirst: BaseTrainInterface {
    override fun Go(): Int {
        return 1
    }
}

interface TrainInterfaceSecond: BaseTrainInterface {
    override fun Go(): Int {
        return 2
    }
}

interface TrainInterfaced: TrainInterfaceFirst, TrainInterfaceSecond {
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
    open var innerStringField: String = ""
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

    operator fun <T : BaseTrainClass> plus (input: T): T{
        return input::class.java.getConstructor(String::class.java)
            .newInstance(this.innerStringField + input.innerStringField) as T
    }

    operator fun <T : BaseTrainClass> inc (): T{
        return this::class.java.getConstructor(String::class.java)
            .newInstance(this.innerStringField + " ") as T
    }

    operator fun <T : BaseTrainClass> dec (): T{
        return this::class.java.getConstructor(String::class.java)
            .newInstance(
                if (this.innerStringField.isNotEmpty())
                    this.innerStringField
                        .substring(0, this.innerStringField.length - 1)
                else this.innerStringField
            ) as T
    }
}


fun BaseTrainClass.symbolCount(symbol: Char) : Int{
    var count = 0
    for(n in this.innerStringField){
        if(n == symbol) count++
    }
    return count
}

class LoggerDelegate{
    operator fun <T : BaseTrainClass> getValue(thisRef: T, property: KProperty<*>): String {
        val innerStringField = thisRef::class.java.getDeclaredField("innerStringField")
        innerStringField.isAccessible = true
        val gotValue = innerStringField.get(thisRef) as String
        Log.d("LoggerDelegate", "Get $gotValue")
        return gotValue
    }
    operator fun <T : BaseTrainClass> setValue(thisRef: T, property: KProperty<*>, value: String) {
        val innerStringField = thisRef::class.java.getDeclaredField("innerStringField")
        innerStringField.isAccessible = true
        innerStringField.set(thisRef, value)
        Log.d("LoggerDelegate", "Set $value")
    }

}

final class BaseTrainClassOverride(newInnerFieldValue: String = "_"):
    BaseTrainClass(newInnerFieldValue), TrainInterfaced {
    override var innerStringField: String by LoggerDelegate()

}