package ksu.sirius.kubio.ui.theme

import android.util.Log

open class BaseTrainClass(open var newInnerFieldValue: String = "") {
    protected open fun Errorer(message: String = ""){

        Log.d("BaseTrainClass", message)
    }
    public open var innerStringField: String = ""
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
    init{
        innerStringField = newInnerFieldValue
    }
}

open class BaseTrainClassOverride(override var newInnerFieldValue: String = "_"):
    BaseTrainClass(newInnerFieldValue){

    init{
        innerStringField = newInnerFieldValue
    }
}