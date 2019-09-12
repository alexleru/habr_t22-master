public class ListLinked<T> {
    Model<T, Model>[] list = new Model[4];

    public void add(T element){
        if(list.length == this.size()){
            resize(4);
        }

        if(list[0] == null){
            Model item = null;
            Model<T, Model> model = new Model<>(element, item);
            list[0] = model;
        } else {
            for (int i = 0; i < list.length; i++) {
                if(list[i] == null){
                    Model item = null;
                    Model<T, Model> model = new Model<>(element, item);
                    list[i] = model;
                    list[i-1].model = list[i];
                    break;
                }
            }
        }

    }

    public T get(int index){
        if(index > 0 && index < this.size()) {
            return list[index].element;
        } else {
            ArrayIndexOutOfBoundsException exception = new ArrayIndexOutOfBoundsException();
            exception.getMessage();
            return null;
        }
    }

    public int resize(int addSize){
        int newSize = list.length + addSize;
            Model<T, Model>[] newList = new Model[newSize];
        for (int i = 0; i < this.size(); i++) {
            newList[i] = list[i];
        }
            this.list = newList;

        return newSize;
    }

    public int size(){
        int i = 0;
        for (Model item : list) {
            if(item == null){
                break;
            } else {
                i++;
            }
        }
        return i;
    }
}
