package ksu.sirius.kubio.ui.theme

import android.util.Log

interface BaseTrainInterface{
    fun Go() : Int
}

interface TrainInterfaceFirst: BaseTrainInterface{
    override fun Go(): Int {
        return 0
    }
}

interface TrainInterfaceSecond: BaseTrainInterface{
    override fun Go(): Int {
        return 1
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
}

final class BaseTrainClassOverride(newInnerFieldValue: String = "_"):
    BaseTrainClass(newInnerFieldValue), TrainInterfaced{
}