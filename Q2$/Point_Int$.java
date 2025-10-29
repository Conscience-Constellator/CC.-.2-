package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Point_Q$;
import CC.$.Q2$_LMNt.Q_Int$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Point_Int$<Q_q$_Typ> extends
		Point_Q$<Q_q$_Typ>,
		Q_Int$
{
	Clas_Rap Class=Init_StRt_Nd(Point_Int$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Point_Int$(Q_q$_Typ A,int B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Pointg_Intg$(Q_q$_Typ[] Ag,int[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Point_Int$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Pointg_Intg$(Iterable<Q_q$_Typ> Ag,Iterable<Integer> Bg)
		{
			Iterator<Q_q$_Typ> A_Itr=Ag.iterator();
			Iterator<Integer> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Point_Int$(A_Itr.next(),B_Itr.next());}
		}
}