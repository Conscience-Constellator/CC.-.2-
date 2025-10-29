package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Point_Q$;
import CC.$.Q2$_LMNt.Q_Point$;
import java.util.Collection;
import java.util.Iterator;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import static java.lang.reflect.Array.newInstance;

public interface Point2$<Q_q$_Typ,q_Q$_Typ> extends
		Point_Q$<Q_q$_Typ>,
		Q_Point$<q_Q$_Typ>
{
	Clas_Rap Class=Init_StRt_Nd(Point2$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Point_Point$(Q_q$_Typ A,q_Q$_Typ B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Pointg_Pointg$(Q_q$_Typ[] Ag,q_Q$_Typ[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Point_Point$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Pointg_Pointg$(Iterable<Q_q$_Typ> Ag,Iterable<q_Q$_Typ> Bg)
		{
			Iterator<Q_q$_Typ> A_Itr=Ag.iterator();
			Iterator<q_Q$_Typ> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Point_Point$(A_Itr.next(),B_Itr.next());}
		}
//		default <In extends A_Typ,Out extends B_Typ>void Pointg_To_Pointg(In[] From,Out[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Out)In_Point_Point(From[IndX]);}}
//			default <In extends A_Typ,Out extends B_Typ>Out[] Pointg_To_Pointg(In[] From,Class<Out> Typ)
//			{
//				Out[] Out=(Out[])newInstance(Typ,From.length);
//				Pointg_To_Pointg(From,Out);
//
//				return Out;
//			}
//				default <In extends A_Typ> B_Typ[] Pointg_To_Pointg(In[] In){return Pointg_To_Pointg(In,Get_Out_Typ());}
//		default <In extends A_Typ,Out extends B_Typ>void Pointg_To_Pointg(Iterable<In> From,Collection<Out> To){for(In In:From){To.add((Out)In_Point_Point(In));}}
//		default <In extends A_Typ,Out extends B_Typ>void Pointg_To_Pointg(List<In> From,List<Out> To){for(In In:From){To.add((Out)In_Point_Point(In));}}
//		default <In extends A_Typ,Out extends B_Typ>void Pointg_To_Pointg(In[] From,Collection<Out> To){for(In In:From){To.add((Out)In_Point_Point(In));}}
		default <In extends Q_q$_Typ,Out extends q_Q$_Typ>void Pointg_Pointg$(Collection<In> From,Out[] To)
		{
			int IndX=0;
			for(In Item:From)
			{
//				To[IndX]=(Out)In_Point_Point(Item);

				IndX+=1;
			}
		}
}