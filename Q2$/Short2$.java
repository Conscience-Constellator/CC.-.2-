package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q2$_LMNt.Q_Short$;
import CC.$.Q2$_LMNt.Short_Q$;
import java.util.Iterator;

public interface Short2$ extends
	Short_Q$,
	Q_Short$
{
	Clas_Rap Class=Init_StRt_Nd(Short2$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Short_Short$(short A,short B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg_Shortg$(short[] Ag,short[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Short_Short$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg_Shortg$(Iterable<Short> Ag,Iterable<Short> Bg)
		{
			Iterator<Short> A_Itr=Ag.iterator();
			Iterator<Short> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Short_Short$(A_Itr.next(),B_Itr.next());}
		}
}