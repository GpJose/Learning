#include <iostream>
#include <string>
#include <windows.h>
using namespace std;
char Control;
class Worker {
public:
    int count = 0;
    std::string name;
    std::string subdivision;
    std::string position;
    float salary = 0.0;
    bool Test(Worker w[], string name)
    {
        for (int i = 0; i < count; i++)
        {
            if (w[i].name == name)
            {
                printf("Фамилия %s уже занято\n", name.c_str());
                return false;
            }
        }
        return true;
    }
    void Add(Worker w[], string name, string subdivision, string pos, float salary)
    {
        if (Test(w, name))
        {
            w[count].name = name;
            w[count].subdivision = subdivision;
            w[count].position = pos;
            w[count].salary = salary;
            count++;
        }
    }
    void DisplayAll(Worker w[])
    {
        for (int i = 0; i < count; i++)
        {
            printf("Работник %d Фамилия %s, ", i, w[i].name.c_str());
            printf("Подразделение %s, ", w[i].subdivision.c_str());
            printf("Позиция %s, ", w[i].position.c_str());
            cout << "Оклад: " << w[i].salary << "\n";
        }
    }
    void Remove(Worker w[], string name)
    {
        for (int i = 0; i < count; i++)
        {
            if (w[i].name == name)
            {
                if (count != i)
                    w[i] = w[i + 1];
                count--;
                printf("Работник %d с фамилией %s был удален\n", i, name.c_str());
            }
        }
    }
    void Display(Worker w[], string subdivision)
    {
        for (int i = 0; i < count; i++)
        {
            if (w[i].subdivision == subdivision)
            {
                printf("Работник %d Фамилия %s, ", i, w[i].name.c_str());
                printf("Подразделение %s, ", w[i].subdivision.c_str());
                printf("Должность %s, ", w[i].position.c_str());
                cout << "Оклад: " << w[i].salary << "\n";
            }
        }
    }
    void Change(Worker w[], string name, string subdivision, string pos, float salary)
    {
        for (int i = 0; i < count; i++)
        {
            if (w[i].name == name)
            {
                w[i].name = name;
                w[i].subdivision = subdivision;
                w[i].position = pos;
                w[i].salary = salary;
                break;
            }
        }
    }
};
int main()
{
    string name, subdivision, position;
    float salary = 0.0;
    Worker *worker = new Worker[256];
    SetConsoleCP(1251);
    SetConsoleOutputCP(1251);
    cout<< "----Управление----\n0 - Закрыть программу\n1 - Добавление\n2 - Удаление\n3 - Изменение\n4 - Поиск по подразделению\n5 - Вывести всех\n";
    do
    {
        cin >> Control;
        cin.ignore();
        switch (Control)
        {
            case '0':
                return 0;
            case '1':
                cout << "Вы выбрали 'Добавить'.\nВведите Фамилию, Подразделение, Должность, Оклад.\n";
                cin >> name >> subdivision >> position >> salary;
                cin.ignore();
                worker->Add(worker, name, subdivision, position, salary);
                cout<<"Выберите действие.\n";
                break;
            case '2':
                cout << "Вы выбрали 'Удаление'\nВведите фамилию для удаления.\n";
                cin >> name;
                worker->Remove(worker, name);
                cout<<"Выберите действие.\n";
                break;
            case '3':
                cout << "Вы выбрали 'Изменение'.\nВведите Фамилию, Подразделение, Должность, Оклад.\n";
                cin >> name >> subdivision >> position >> salary;
                cin.ignore();
                worker->Change(worker, name, subdivision, position, salary);
                cout<<"Выберите действие.\n";
                break;
            case '4':
                cout << "Вы выбрали 'Поиск по подразделению'.\nВведите Подразделение\n";
                cin >> subdivision;
                worker->Display(worker, subdivision);
                cout<<"Выберите действие.\n";
                break;
            case '5':
                cout << "Список всех работников\n";
                worker->DisplayAll(worker);
                cout<<"Выберите действие.\n";
                break;
            default:
                cout << "\n---------------------------------\nНеверный выбор. Попробуйте ещё раз\n---------------------------------\n";
        }
    }
    while (true);
}
