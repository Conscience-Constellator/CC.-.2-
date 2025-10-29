package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Point_Q$;
import CC.$.Q2$_LMNt.Q_ChR$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Point_ChR$<Q_q$_Typ> extends
		Point_Q$<Q_q$_Typ>,
		Q_ChR$
{
	Clas_Rap Class=Init_StRt_Nd(Point_ChR$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Point_ChR$(Q_q$_Typ A,char B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Pointg_ChRg$(Q_q$_Typ[] Ag,char[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Point_ChR$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Pointg_ChRg$(Iterable<Q_q$_Typ> Ag,Iterable<Character> Bg)
		{
			Iterator<Q_q$_Typ> A_Itr=Ag.iterator();
			Iterator<Character> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Point_ChR$(A_Itr.next(),B_Itr.next());}
		}
}