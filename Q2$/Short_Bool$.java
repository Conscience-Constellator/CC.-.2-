package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Q_Bool$;
import CC.$.Q2$_LMNt.Short_Q$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Short_Bool$ extends
		Short_Q$,
		Q_Bool$
{
	Clas_Rap Class=Init_StRt_Nd(Short_Bool$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Short_Bool$(short A,boolean B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg_Boolg$(short[] Ag,boolean[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Short_Bool$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg_Boolg$(Iterable<Short> Ag,Iterable<Boolean> Bg)
		{
			Iterator<Short> A_Itr=Ag.iterator();
			Iterator<Boolean> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Short_Bool$(A_Itr.next(),B_Itr.next());}
		}
}