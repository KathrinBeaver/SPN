/*
 * Copyright (C) 2017  Alexander Porechny alex.porechny@mail.ru
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Attribution-NonCommercial-ShareAlike 3.0 Unported
 * (CC BY-SA 3.0) as published by the Creative Commons.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Attribution-NonCommercial-ShareAlike 3.0 Unported (CC BY-SA 3.0)
 * for more details.
 *
 * You should have received a copy of the Attribution-NonCommercial-ShareAlike
 * 3.0 Unported (CC BY-SA 3.0) along with this program.
 * If not, see <https://creativecommons.org/licenses/by-nc-sa/3.0/legalcode>
 *
 * Thanks to Sergey Politsyn and Katherine Politsyn for their help in the development of the library.
 *
 *
 * Copyright (C) 2017 Александр Поречный alex.porechny@mail.ru
 *
 * Эта программа свободного ПО: Вы можете распространять и / или изменять ее
 * в соответствии с условиями Attribution-NonCommercial-ShareAlike 3.0 Unported
 * (CC BY-SA 3.0), опубликованными Creative Commons.
 *
 * Эта программа распространяется в надежде, что она будет полезна,
 * но БЕЗ КАКИХ-ЛИБО ГАРАНТИЙ; без подразумеваемой гарантии
 * КОММЕРЧЕСКАЯ ПРИГОДНОСТЬ ИЛИ ПРИГОДНОСТЬ ДЛЯ ОПРЕДЕЛЕННОЙ ЦЕЛИ.
 * См. Attribution-NonCommercial-ShareAlike 3.0 Unported (CC BY-SA 3.0)
 * для более подробной информации.
 *
 * Вы должны были получить копию Attribution-NonCommercial-ShareAlike 3.0
 * Unported (CC BY-SA 3.0) вместе с этой программой.
 * Если нет, см. <https://creativecommons.org/licenses/by-nc-sa/3.0/legalcode>
 *
 * Благодарим Сергея и Екатерину Полицыных за оказание помощи в разработке библиотеки.
 */
 package alexporechny.partOfSpeech;

/**
 * Краткое прилагательное ГПК - ГП - 71
 *
 * @author Alex Porechny alex.porechny@mail.ru
 */
public final class GpkShortAdjective extends WordForm {

    public GpkShortAdjective(int myIndex, int intRod, int intChis) {
        super(myIndex, intRod, intChis);
        initialization();
    }

    @Override
    protected void initialization() {
        namePtOfSp = "Краткое прилагательное";
        indexPtOfSp = 71;
    }

    @Override
    public boolean isRelationsSwitch(WordForm child) {
        switch (child.indexPtOfSp) {
            case 1:
                return Math.abs(child.myIndex - myIndex) <= 4 && ((child.intPad == 1 || child.intPad == 4) ? (!((SNoun) child).havePreposition()) : true);
            case 17:
                return Math.abs(myIndex - child.myIndex) <= 4;
            default:
                return false;
        }
    }

    @Override
    public boolean isMainPS() {
        return true;
    }
}
